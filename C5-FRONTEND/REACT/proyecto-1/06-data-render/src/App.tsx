import { useCharacters } from './hooks/useCharacters';
import CharacterCard from './componentes/characterCard';
import './style/grid.css';
function App() {
  const { characters, loading } = useCharacters();

  if (loading) return <p style={{ textAlign: 'center' }}>Cargando...</p>;

  return (
    <>
      <h1 style={{ textAlign: 'center' }}>Rick y Morty</h1>
      <div className="grid">
        {characters.map((ch) => (
          <CharacterCard key={ch.id} character={ch} />
        ))}
      </div>
    </>
  );
}

export default App;