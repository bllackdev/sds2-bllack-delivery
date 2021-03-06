import { Link } from "react-router-dom";

import { ReactComponent as MainImg } from '../assets/img/women-delivery.svg';
import Footer from '../Footer';

import './styles.css';

function Home () {
    return (
        <>
            <div className="home-container">
                <div className="home-content">
                    <div className="home-actions">
                        <h1 className="home-title">
                            Faça seu pedido <br/> que entregamos <br/> para você!!!
                        </h1>
                        <h3 className="home-subtitle">
                            Escolha o seu pedido e em poucos minutos <br/> levaremos na sua porta
                        </h3>
                        <Link to="/orders" className="home-btn-order">
                            FAZER PEDIDO
                        </Link>
                        <div className="home-image">
                            <MainImg />
                        </div>
                    </div>
                </div>
            </div>
            <Footer />

        </>
    )
}

export default Home;