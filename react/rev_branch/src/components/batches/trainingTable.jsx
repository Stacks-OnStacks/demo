import { createContext, useState } from "react";
import Employee from "../employees/employee";
import AddBatch from "./addBatch";
import BatchCounter from "./batchCounter";
import TrainingTableData from "./trainingTableData";

export const trainingContext = createContext();

export default function TrainingTable() {
    const techArrayOfObject = [
        {
            trainingName: "Java/React Enterprise",
            batchSize: 15,
            duration: "10w",
        },
        {
            trainingName: "PEGA",
            batchSize: 12,
            duration: "12w",
        },
        {
            trainingName: "Java Full Stack Angular",
            batchSize: 20,
            duration: "10w",
        },
        {
            trainingName: "Python wtih Automation",
            batchSize: 25,
            duration: "10w",
        },
    ];

    const [trainingArray, setTrainingArray] = useState(techArrayOfObject);
    console.log(trainingArray);

    return (
        <>
            <hr></hr>
            <Employee employeeName="Harvey" title="Tech Manager" estSalary={100000}></Employee>
            <table>
                <thead>
                    <tr>
                        <th>Training Name</th>
                        <th>Batch Size</th>
                        <th>Duration</th>
                    </tr>
                </thead>
                <TrainingTableData tech={trainingArray}></TrainingTableData>
            </table>
            <trainingContext.Provider value={[trainingArray, setTrainingArray]}>
                <AddBatch></AddBatch>
                <BatchCounter></BatchCounter>
            </trainingContext.Provider>
        </>
    );
}
