import React from "react";
import CompCard from "../CompCard/CompCard";
import "../CompCardContainer/CompCardContainer.scss"

const CompCardContainer = (props) => {
  const {comps} = props;
  const CompJSX = comps ? comps.map((comp) => (
    <CompCard
      id={comp.id}
      compName={comp.compName}
      imgURL={comp.imgURL}
      location={comp.location}
      date={comp.date}
      registryDedline={comp.registryDedline}
      fee={comp.fee}
      key={comp.id}
    />
  )) : null;

  return <div className="comp-container">{CompJSX}</div>;
};

export default CompCardContainer;



