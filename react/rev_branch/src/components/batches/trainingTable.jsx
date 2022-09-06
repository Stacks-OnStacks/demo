import Employee from "../employees/employee";
import TrainingTableData from "./trainingTableData";

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
    ];

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
                <TrainingTableData tech={techArrayOfObject}></TrainingTableData>
            </table>
        </>
    );
}
