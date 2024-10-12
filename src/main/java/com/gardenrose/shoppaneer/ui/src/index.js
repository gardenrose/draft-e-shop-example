import React from "react";
import { createRoot } from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import App from "./App";

const rootElement = document.getElementById("root");
const root = createRoot(rootElement);

// fonts awesome for icons
// canva for logo

root.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>
);
