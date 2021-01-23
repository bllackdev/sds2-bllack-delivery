import { ReactComponent as Logo } from '../assets/img/icons/logo.svg';

import './styles.css';

function Navbar() {
    return (
        <nav className="main-navbar">
            <Logo />
            <a href="home" className="logo-text">Bllack Delivery</a>
        </nav>
    )
}

export default Navbar;