import React from 'react';
import "../style/Home.css"
import ad1 from "../images/ad1.jpg"
import ad2 from "../images/ad2.jpg"
import ad3 from "../images/ad3.jpg"
import ad5 from "../images/ad5.jpg"
import ad6 from "../images/ad6.jpg"
import bili from "../images/bili.png"
import bili3 from "../images/bili3.png"
import bili10 from "../images/bili10.png"
import bili11 from "../images/bili11.png"
import bili12 from "../images/bili12.png"

function Home() {
  return (
    <div>

    <h1 align="center" className="title">Welcome! Here are the most recent news</h1 >
    <div className="adcontainer">
    <img className="adimage" src={bili10}/>
    <img className="adimage" src={bili3}/>
    <img className="adimage" src={bili}/>
    <img className="adimage" src={bili11}/>
    <img className="adimage" src={bili12}/>
    <img className="adimage" src={ad1}/>
    <img className="adimage" src={ad3}/>
    <img className="adimage" src={ad2}/>
    <img className="adimage" src={ad5}/>
    <img className="adimage" src={ad6}/>
    </div>
    </div>
  )

};

export default Home;