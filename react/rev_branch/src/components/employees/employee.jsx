// set up our function to take in some properties, so an Object!
export default function Employee(props) {
    // const employeeName = props.employeeName;
    // const title = props.title;
    // const estSalary = props.estSalary;

    // How to improve on the above?

    const { employeeName, title, estSalary } = props;

    return (
        // what's <>? This is the React.Fragment default syntax, so when React reads it it will automatically consider it a React.Fragment
        <>
            <h3>Name: {employeeName}</h3>
            <h5>Title: {title}</h5>
            <h5>Salary: {estSalary}</h5>
        </>
    );
}
