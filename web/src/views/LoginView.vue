<template>
  <div class="wrapper">
    <div class="login">
      <el-card class="box-card">
        <template #header>
          <div class="card-header">
            <span class="text-20">自助签到平台</span>
            <el-button class="button" @click="toggleDark()" text>{{ isDark ? '暗黑' : '明亮' }}</el-button>
          </div>
        </template>
        <el-form ref="ruleFormRef" :model="ruleForm" status-icon :rules="rules" class="demo-ruleForm">
          <el-form-item prop="username">
            <el-input placeholder="用户名" v-model="ruleForm.username" type="text" autocomplete="off" />
          </el-form-item>
          <el-form-item prop="password">
            <el-input placeholder="密码" v-model="ruleForm.password" type="password" autocomplete="off" />
          </el-form-item>

          <el-form-item>
            <el-button type="primary" @click="submitForm(ruleFormRef)">提交</el-button>
            <el-button @click="resetForm(ruleFormRef)">重置</el-button>
          </el-form-item>
        </el-form>
      </el-card>
    </div>
  </div>
</template>
<script setup lang="ts">
import { reactive, ref } from 'vue'
import type { FormInstance } from 'element-plus'
import { useDark, useToggle } from '@vueuse/core'

const ruleFormRef = ref<FormInstance>()
const isDark = useDark()
const toggleDark = useToggle(isDark)
// const checkAge = (rule: any, value: any, callback: any) => {
//   if (!value) {
//     return callback(new Error('Please input the age'))
//   }
//   setTimeout(() => {
//     if (!Number.isInteger(value)) {
//       callback(new Error('Please input digits'))
//     } else {
//       if (value < 18) {
//         callback(new Error('Age must be greater than 18'))
//       } else {
//         callback()
//       }
//     }
//   }, 1000)
// }

const validateName = (rule: any, value: any, callback: any) => {
  if (value === '') {
    callback(new Error('请输入用户名'))
  } else {
    if (ruleForm.password !== '') {
      if (!ruleFormRef.value) return
      ruleFormRef.value.validateField('password', () => null)
    }
    callback()
  }
}
const validatePass = (rule: any, value: any, callback: any) => {
  if (value === '') {
    callback(new Error('请输入密码'))
  } else {
    if (ruleForm.password !== '') {
      if (!ruleFormRef.value) return
      ruleFormRef.value.validateField('password', () => null)
    }
    callback()
  }
}
// const validatePass2 = (rule: any, value: any, callback: any) => {
//   if (value === '') {
//     callback(new Error('Please input the password again'))
//   } else if (value !== ruleForm.pass) {
//     callback(new Error("Two inputs don't match!"))
//   } else {
//     callback()
//   }
// }

const ruleForm = reactive({
  username: '',
  password: '',
  // checkPass: '',
  // age: '',
})

const rules = reactive({
  username: [{ validator: validateName, trigger: 'blur' }],
  password: [{ validator: validatePass, trigger: 'blur' }],
  // checkPass: [{ validator: validatePass2, trigger: 'blur' }],
  // age: [{ validator: checkAge, trigger: 'blur' }],
})

const submitForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.validate((valid) => {
    if (valid) {
      console.log('submit!')
    } else {
      console.log('error submit!')
      return false
    }
  })
}

const resetForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.resetFields()
}
</script>
<style lang="scss">
.wrapper {
  width: 100vw;
  height: 100vh;
  display: flex;
  place-items: center;
  justify-content: center;
}

#logo {
  display: flex;
  place-items: center;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

.login {
  width: 30vw;
}

.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
</style>
