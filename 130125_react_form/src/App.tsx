import './App.css'
import CharacterGallery from "./components/CharacterGallery.tsx";
import {useEffect, useState} from "react";
import {characters} from "./Characters.ts";
import CreateCharacter from "./components/createCharacter.tsx";
import axios from 'axios';

export default function App() {
    const [searchText, setSearchText] = useState("");
    const [characterList, setCharacterList] = useState(characters);
    const [fetchedCharacters, setFetchedCharacters] = useState<[]>([])

    const filteredCharacters = characterList.filter((character) =>
        character.name.toLowerCase().includes(searchText.toLowerCase())
    );


    function fetchData() {
        axios.get('https://rickandmortyapi.com/api/character')
            .then(response => {
                setFetchedCharacters(response.data.results)
                console.log("fetchedCharacters in fetchData", fetchedCharacters)
            })
            .catch(error => {
                console.error('Error fetching data:', error);
            });
    }

    useEffect(() => {
        fetchData()
        console.log("fetchedCharacters in useEffect", fetchedCharacters)
    }, [])

    return (
        <>
            <input type="text" onChange={(e) => setSearchText(e.target.value)} placeholder="Search for a character" />
            <CreateCharacter characterList={characterList} setCharacterList={setCharacterList} />
            <h1>Fetched Characters</h1>
            {fetchedCharacters.length > 0 ? (
                <CharacterGallery characters={fetchedCharacters} />
            ) : (
                <p>No characters found</p>
            )}
            <h1>Filtered Characters</h1>
            {filteredCharacters.length > 0 ? (
                <CharacterGallery characters={filteredCharacters} />
            ) : (
                <p>No characters found</p>
            )}
        </>
    );
}
