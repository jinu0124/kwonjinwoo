import axios from 'axios'
// import router from '@/router'
// import store from '@/store/index.js'


const _axios = axios.create({
    baseURL: "",
    // baseURL: "http://localhost:8080/api",
    timeout: 20000,
  })



export default _axios;