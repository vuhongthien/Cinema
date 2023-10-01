import React from "react"; // Add this import statement
import { Routes, Route } from "react-router-dom";
import MasterLayout from "./pages/user/homePage/theme/masterLayout";
import HomePage from "./pages/user/homePage";
import { ROUTERS } from "./utils/router";
import MoviesPage from "./pages/user/homePage/theme/pages/movies";
import TvShowPage from "./pages/user/homePage/theme/pages/tvshow";

const renderUserRouter = () => {
  const userRouters = [
    {
      path: ROUTERS.USER.HOME,
      component: HomePage,
    },
    {
      path: ROUTERS.USER.MOVIES,
      component: MoviesPage ,
    },
    {
      path: ROUTERS.USER.TVSHOW,
      component: TvShowPage ,
    },
  ];

  return (
    <MasterLayout>
      <Routes>
        {userRouters.map((item, key) => (
          <Route key={key} path={item.path} element={<item.component />} />
        ))}
      </Routes>
    </MasterLayout>
  );
};

const RouterCustom = () => {
  return renderUserRouter();
};

export default RouterCustom;