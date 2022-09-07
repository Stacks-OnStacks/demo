import { useContext, useRef } from "react";
import { trainingContext } from "./trainingTable";

export default function AddBatch() {
    // useState - this returns two values [readOnly, functionToReassignReadOnlyVariable]
    // const [trainingArray, setTrainingArray] = useState(props.tech);
    // console.log(trainingArray);

    const [trainingArray, setTrainingArray] = useContext(trainingContext);

    const trainingNameInput = useRef();
    const batchSizeInput = useRef();
    const durationInput = useRef();

    function submit() {
        const newTraining = {
            trainingName: trainingNameInput.current.value,
            batchSize: batchSizeInput.current.value,
            duration: durationInput.current.value,
        };
        //trainingArray.push(newTraining); // DO NOT DIRECTLY MANIPULATE THE READ ONLY STATE VARIABLE
        //setTrainingArray(trainingArray); // this will not recognize any difference because you manipulated the readOnly state value training array

        const updatedArray = [...trainingArray, newTraining];
        setTrainingArray(updatedArray);
    }

    return (
        <>
            <input placeholder="Enter Training Name" ref={trainingNameInput} />
            <input placeholder="Enter Batch Size" ref={batchSizeInput} />
            <input placeholder="Enter Duration ##w" ref={durationInput} />
            <button onClick={submit}>Submit New Training</button>
        </>
    );
}
