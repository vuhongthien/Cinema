import { Routes, Route } from "react-router-dom";
import MasterLayout from "./pages/user/homePage/theme/masterLayout";
import HomePage from "./pages/user/homePage"; // Import the Test component

import { ROUTERS } from "./utils/router";
import test from "./pages/user/homePage/test";

const renderUserRouter = () => {
  const userRouters = [
    {
      path: ROUTERS.USER.HOME,
      component: HomePage ,
    },
    {
      path: ROUTERS.USER.PROFILE,
      component: test ,
    }
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