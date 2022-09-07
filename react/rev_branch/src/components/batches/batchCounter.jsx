import { useContext } from "react";
import { trainingContext } from "./trainingTable";

export default function BatchCounter() {
    const [trainingArray] = useContext(trainingContext);

    return (
        <>
            <p>The number of batches is: {trainingArray.length}</p>
        </>
    );
}
