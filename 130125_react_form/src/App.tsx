import './App.css'
import CharacterGallery from "./components/CharacterGallery.tsx";
import {useState} from "react";
import {characters} from "./Characters.ts";
import CreateCharacter from "./components/createCharacter.tsx";

export default function App() {
    const [searchText, setSearchText] = useState("");
    const [characterList, setCharacterList] = useState(characters);

    const filteredCharacters = characterList.filter((character) =>
        character.name.toLowerCase().includes(searchText.toLowerCase())
    );

    return (
        <>
            <input type="text" onChange={(e) => setSearchText(e.target.value)} placeholder="Search for a character" />
            <CreateCharacter characterList={characterList} setCharacterList={setCharacterList} />
            {filteredCharacters.length > 0 ? (
                <CharacterGallery characters={filteredCharacters} />
            ) : (
                <p>No characters found</p>
            )}
        </>
    );
}
