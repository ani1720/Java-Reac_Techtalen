import Logo from "./assets/UppAllNight.png";

const Header = () => {
    return (
        <>
        
        <h1>Welcome to Comunity</h1>
        <nav>
            <a href="Prueba.jsx">Prueba 1</a>
            <a href="Prueba2.jsx">Prueba2</a>
        </nav>
        <div className="logo"><img src={Logo} alt="Imagen de prueba" /></div>
        </>
    )
}
export default Header