// import "./CreateCompetition.scss";
// import NewCompetitionForm from "../NewCompForm/NewCompForm";

// const CreatePlayer = () => {
//   const handleSubmit = async comps => {
//     const result = await fetch("http://localhost:8080/player", {
//       method: "POST",
//       headers: {
//         "Content-Type": "application/json",
//       },
//       body: JSON.stringify(comps),
//     });

//     if (result.ok) {
//       alert("comps added");
//     } else {
//       const message = await result.text();
//       alert(message);
//     }
//   };

//   const defaultFormState = { imgURL: "", compName: "", location: "", date: "",registryDedline: "",fee: "" , competitiorsLimit : "", requireQualify: "", email: "" };

//   return (
//     <section className="create-greeting">
//       <h2 className="create-greeting__title">Create a new Competition</h2>
//       <NewCompetitionForm handleSubmit={handleSubmit} defaultFormState={defaultFormState} formTitle="Add A New Competition" />
//     </section>
//   );
// };

// export default CreateCompetition;
