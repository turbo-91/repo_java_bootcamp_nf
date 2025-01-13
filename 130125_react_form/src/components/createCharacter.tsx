import {useState} from "react";


export default function CreateCharacter() {

    const [id, setId] = useState<string>("")
    const [name, setName] = useState<string>("")
    const [species, setSpecies] = useState<string>("")
    const [image, setImage] = useState<string>("")

    return (
        <>
            <form>
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
        </>
)
}