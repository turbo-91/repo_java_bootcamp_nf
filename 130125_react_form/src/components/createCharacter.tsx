import {FormEvent, useState} from "react";
import {characters} from "../Characters.ts";
import {Character} from "../types/RickAndMortyCharacter.ts";

type CreateCharacterProps = {
    characterList: Character[];
    setCharacterList: React.Dispatch<React.SetStateAction<Character[]>>;
};

export default function CreateCharacter({ characterList, setCharacterList }: CreateCharacterProps) {

    const [id, setId] = useState<string>("")
    const [name, setName] = useState<string>("")
    const [species, setSpecies] = useState<string>("")
    const [image, setImage] = useState<string>("")


    function onSubmit(event:FormEvent<HTMLFormElement>){
        event.preventDefault();

        const newCharacter: Character = {
            id: parseInt(id),
            name,
            status: "unknown",
            species,
            type: "",
            gender: "unknown",
            origin: { name: "unknown", url: "" },
            location: { name: "unknown", url: "" },
            image,
            episode: [],
            url: "",
            created: new Date().toISOString(),
        };
        setCharacterList([...characterList, newCharacter]);
        setId("");
        setName("");
        setSpecies("");
        setImage("");
    }

    return (
        <>
            <form onSubmit={onSubmit}>
                <label>Id:
                    <input
                        type={"text"}
                        value={id}
                        onChange={(event) => setId(event.target.value)}/>
                </label>
                <br/>
                <label>Name:
                    <input
                        type={"text"}
                        value={name}
                        onChange={(event) => setName(event.target.value)}/>
                </label>
                <br/>
                <label>Species:
                    <input
                        type={"text"}
                        value={species}
                        onChange={(event) => setSpecies(event.target.value)}/>
                </label>
                    <br/>
                    <label>Image:
                        <input
                            type={"text"}
                            value={image}
                            onChange={(event) => setImage(event.target.value)}/>
                    </label>
            </form>
            <button>submit</button>
        </>
)
}