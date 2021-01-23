import { Link } from "react-router-dom";

import { ReactComponent as Logo } from '../assets/img/icons/logo.svg';

import './styles.css';

function Navbar() {
    return (
        <nav className="main-navbar">
            <Logo />
            <Link to="/" className="logo-text">Bllack Delivery</Link>
        </nav>
    )
}

export default Navbar;