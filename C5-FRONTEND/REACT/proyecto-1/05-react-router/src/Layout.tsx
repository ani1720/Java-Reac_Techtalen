import {
    Outlet
} from 'react-router-dom'

import CustomLink from './CustomLink';

function Layout() {
  return (
    <div>
      <nav>
        <ul>
          <li>
            <CustomLink to="/">Home</CustomLink>
          </li>
          <li>
            <CustomLink to="/about">About</CustomLink>
          </li>
          <li>
            <CustomLink to="/servicios">Servicios</CustomLink>
          </li>
        </ul>
      </nav>

      <hr />

      <Outlet />
    </div>
  );
}
export default Layout