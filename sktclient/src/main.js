import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
// import FB from 'vue-facebook-login-component'

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  // FB,
  render: (h) => h(App),
}).$mount("#app");
