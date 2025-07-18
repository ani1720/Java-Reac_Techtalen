//renderizacion de Arrays con Map
const products = [
    {title: 'Col', isFruit: false, id:1},
    {title: 'Ajo', isFruit: false, id:2},
    {title: 'Manzana', isFruit: true, id:3},
];

function ShoppingList() {
    const lisItems = products.map(product =>
        <li
            key={product.id}
            style={{
                color: product.isFruit ? 'magenta':
                'darkgreen'
            }}
            >
                {product.title}
        </li>
    );
    return (
        <ul>{lisItems}</ul>
    );
};

export default ShoppingList