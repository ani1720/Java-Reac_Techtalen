import './Perfil.css'
const louis = {
    nombre: 'Louis',
    imageUrl: 'https://bccolonels.com/wp-content/uploads/2021/04/louis-tomlinson-900x562.jpg',
    imageSize: 90,
};
function App() {
  const [mostrar, setMostrar] = React.useState(false);

  return (
    <div>
      <button onClick={() => setMostrar(true)}>Mostrar a Louis</button>
      {mostrar && <Louis />}
    </div>
  );
}

function Louis() {
    return (
    <>
    <h2>{louis.nombre}</h2>
    <img className="avatar" 
    src={louis.imageUrl} 
    alt={'Foto de' + louis.nombre}
    style={{
          height: louis.imageSize
        }}
      />
      </>
      );
    }

export default Louis;