import Logo from "./assets/UppAllNight.png"
import './header.css'
const Header = () => {
    return (
        <>
        <div className="logo"><img src={Logo} alt="Imagen de prueba" /></div>
        <h1>Welcome to Comunity</h1>
        <nav>
            <a href="Prueba.jsx">Prueba 1</a>
            <a href="Prueba2.jsx">Prueba2</a>
        </nav>
        
        </>
    )
}
export default Header