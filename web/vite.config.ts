import { fileURLToPath, URL } from "node:url";

import { defineConfig } from "vite";
import vue from "@vitejs/plugin-vue";
import vueJsx from "@vitejs/plugin-vue-jsx";
import Unocss from "unocss/vite";
import presetUno from '@unocss/preset-uno'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue(), vueJsx(), 
    Unocss({
    presets: [
      presetUno()
    ]
  })],
  resolve: {
    alias: {
      "@": fileURLToPath(new URL("./src", import.meta.url)),
    },
  },
});
