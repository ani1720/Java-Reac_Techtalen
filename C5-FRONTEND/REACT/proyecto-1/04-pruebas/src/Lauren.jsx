import './Perfil.css';

const lauren = {
    nombre: 'Lauren',
    imageUrl: 'https://s1.ticketm.net/dam/a/f7d/e8498227-1663-4ff3-9099-22e627958f7d_1532541_RETINA_PORTRAIT_16_9.jpg',
    imageSize: 90,
};
function Lauren() {
    return (
    <>
<h2>{lauren.nombre}</h2>
      <img
        className="avatar"
        src={lauren.imageUrl}
        alt={'Foto de ' + lauren.nombre}
        style={{
          height: lauren.imageSize
        }}
      />
    </>
    );
}
export default Lauren