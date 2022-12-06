<script setup lang="ts">
// This starter template is using Vue 3 <script setup> SFCs
// Check out https://vuejs.org/api/sfc-script-setup.html#script-setup
import HelloWorld from './components/HelloWorld.vue'
import {
  ElContainer, ElHeader, ElAside, ElMain, ElIcon,
  ElDropdown, ElDropdownMenu, ElDropdownItem, ElScrollbar, ElMenu, ElSubMenu, ElMenuItem, ElMenuItemGroup,
} from 'element-plus'
import { Document, Setting, Message } from "@element-plus/icons-vue";
import { useDark, useToggle } from '@vueuse/core'

const isDark = useDark()
const toggleDark = useToggle(isDark)

</script>

<template>
  <el-container>
    <el-header style="text-align: right; font-size: 12px">
      <div class="toolbar">
        <el-dropdown>
          <el-icon style="margin-right: 8px; margin-top: 1px">
            <setting />
          </el-icon>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item>View</el-dropdown-item>
              <el-dropdown-item>Add</el-dropdown-item>
              <el-dropdown-item>Delete</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
        <span>Tom</span>
      </div>
    </el-header>
    <el-container>
      <el-aside width="200px">
        <el-scrollbar>
          <el-menu :default-openeds="['1', '3']">
            <el-sub-menu index="1">
              <template #title>
                <el-icon>
                  <message />
                </el-icon>Navigator One
              </template>
              <el-menu-item-group>
                <template #title>Group 1</template>
                <el-menu-item index="1-1">Option 1</el-menu-item>
                <el-menu-item index="1-2">Option 2</el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group title="Group 2">
                <el-menu-item index="1-3">Option 3</el-menu-item>
              </el-menu-item-group>
              <el-sub-menu index="1-4">
                <template #title>Option4</template>
                <el-menu-item index="1-4-1">Option 4-1</el-menu-item>
              </el-sub-menu>
            </el-sub-menu>
            <el-sub-menu index="2">
              <template #title>
                <el-icon>
                  <document />
                </el-icon>Navigator Two
              </template>
              <el-menu-item-group>
                <template #title>Group 1</template>
                <el-menu-item index="2-1">Option 1</el-menu-item>
                <el-menu-item index="2-2">Option 2</el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group title="Group 2">
                <el-menu-item index="2-3">Option 3</el-menu-item>
              </el-menu-item-group>
              <el-sub-menu index="2-4">
                <template #title>Option 4</template>
                <el-menu-item index="2-4-1">Option 4-1</el-menu-item>
              </el-sub-menu>
            </el-sub-menu>
            <el-sub-menu index="3">
              <template #title>
                <el-icon>
                  <setting />
                </el-icon>Navigator Three
              </template>
              <el-menu-item-group>
                <template #title>Group 1</template>
                <el-menu-item index="3-1">Option 1</el-menu-item>
                <el-menu-item index="3-2">Option 2</el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group title="Group 2">
                <el-menu-item index="3-3">Option 3</el-menu-item>
              </el-menu-item-group>
              <el-sub-menu index="3-4">
                <template #title>Option 4</template>
                <el-menu-item index="3-4-1">Option 4-1</el-menu-item>
              </el-sub-menu>
            </el-sub-menu>
          </el-menu>
        </el-scrollbar>
      </el-aside>
      <el-main>
        <div>
          <a href="https://vitejs.dev" target="_blank">
            <img src="/vite.svg" class="logo" alt="Vite logo" />
          </a>
          <a href="https://vuejs.org/" target="_blank">
            <img src="./assets/vue.svg" class="logo vue" alt="Vue logo" />
          </a>
        </div>
        <button @click="toggleDark()">切换</button>
        <HelloWorld msg="Vite + Vue" />
      </el-main>
    </el-container>
  </el-container>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
