export default function TrainingTableData(props) {
    // the props are the state fromt he parent component
    const techArray = props.tech.map((o) => {
        return (
            <tr>
                <td>{o.trainingName}</td>
                <td>{o.batchSize}</td>
                <td>{o.duration}</td>
            </tr>
        );
    });

    return <tbody>{techArray}</tbody>;
}
