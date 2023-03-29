// import React from "react";

// const NewCompForm = ({ handleSubmit, handleCloseForm, newComp, setNewComp }) => {
//   const handleInputChange = (e) => {
//     const { name, value } = e.target;
//     setNewComp({ ...newComp, [name]: value });
//   };

//   return (
//     <div>
//       <h2>Add New Competition</h2>
//       <form onSubmit={handleSubmit}>
//         <label>
//           Competition Name:
//           <input
//             type="text"
//             name="compName"
//             value={newComp.compName}
//             onChange={handleInputChange}
//           />
//         </label>
//         <label>
//           Location:
//           <input
//             type="text"
//             name="location"
//             value={newComp.location}
//             onChange={handleInputChange}
//           />
//         </label>
//         <label>
//           Date:
//           <input
//             type="text"
//             name="date"
//             value={newComp.date}
//             onChange={handleInputChange}
//           />
//         </label>
//         <label>
//           Registry Deadline:
//           <input
//             type="text"
//             name="registryDedline"
//             value={newComp.registryDedline}
//             onChange={handleInputChange}
//           />
//         </label>
//         <label>
//           Fee:
//           <input
//             type="text"
//             name="fee"
//             value={newComp.fee}
//             onChange={handleInputChange}
//           />
//         </label>
//         <button type="submit">Submit</button>
//         <button type="button" onClick={handleCloseForm}>
//           Cancel
//         </button>
//       </form>
//     </div>
//   );
// };

// export default NewCompForm;
