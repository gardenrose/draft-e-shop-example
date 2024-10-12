import React from 'react';
import { Link } from 'react-router-dom';
import '../style/Navigation.css'
import logo from '../images/shoppaneer_logo.png'

const Navigation = () => {
  return (
    <nav className="navbar">
      <ul className="navbar-links">
        <img src={logo} className="navlogo"/>
        <li>
          <Link to="/" className="navitem">Men</Link>
        </li>
        <li>
          <Link to="/about" className="navitem">Women</Link>
        </li>
        <li>
          <Link to="/about" className="navitem">Kids</Link>
        </li>
        
        <li>
          <Link to="/about" className="navitem">About</Link>
        </li>
      </ul>
      
        
      <span>
        <input className="navsearch" placeholder="What are you looking for?"/>
        <button className="searchbtn">
          <i className="fa fa-search searchicon" aria-hidden="true"></i>
        </button>
        </span>
        <span className="navuseraria">
        <i class="fa fa-user-circle navicon" aria-hidden="true"></i>
        <i class="fa fa-shopping-cart navicon" aria-hidden="true"></i>
        </span>
    </nav>
  );
};

export default Navigation;