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
    const [page, setPage] = useState(1);

    const filteredCharacters = characterList.filter((character) =>
        character.name.toLowerCase().includes(searchText.toLowerCase())
    );


    function fetchData() {
        axios.get('https://rickandmortyapi.com/api/character/?page=' + page)
            .then(response => {
                setFetchedCharacters(response.data.results)
                console.log("fetchedCharacters in fetchData", fetchedCharacters)
            })
            .catch(error => {
                console.error('Error fetching data:', error);
            });
    }

    function increasePage() {
        setPage((prevPage) => prevPage + 1);
    }

    function decreasePage() {
        setPage((prevPage) => Math.max(prevPage - 1, 1))
    }

    useEffect(() => {
        fetchData()
        console.log("fetchedCharacters in useEffect", fetchedCharacters)
    }, [page])

    return (
        <>
            <input type="text" onChange={(e) => setSearchText(e.target.value)} placeholder="Search for a character"/>
            <CreateCharacter characterList={characterList} setCharacterList={setCharacterList}/>
            <h1>Fetched Characters</h1>
            {fetchedCharacters.length > 0 ? (
                <CharacterGallery characters={fetchedCharacters}/>
            ) : (
                <p>No characters found</p>
            )}
            <div onClick={() => decreasePage()}>back</div>
            <div onClick={() => increasePage(2)}>next</div>
        </>
    );
}
