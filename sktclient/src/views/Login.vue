<template>
    <div>
        <p>login page</p>
        <div>
            <button class="button button2" @click="snsLogin('facebook')">Facebook Login</button>
            
            <button class="button button1" @click="snsLogin('instagram')">Instagram Login</button>
<div class="fb-login-button" data-width="" data-size="large" data-button-type="continue_with" data-layout="default" data-auto-logout-link="false" data-use-continue-as="false"></div>
          
        </div>

    </div>
    
</template>

<script async defer crossorigin="anonymous" src="https://connect.facebook.net/ko_KR/sdk.js#xfbml=1&version=v13.0&appId=1207720376635833&autoLogAppEvents=1" nonce="zWthnNPN"></script>

<script>
import user from "../api/user"
import FB from 'vue-facebook-login-component'
import Vue from 'vue'

const vue_fb = {}
vue_fb.install = function install(Vue, options) {
    (function(d, s, id){
        var js, fjs = d.getElementsByTagName(s)[0]
        if (d.getElementById(id)) {return}
        js = d.createElement(s)
        js.id = id
        js.src = "//connect.facebook.net/en_US/sdk.js"
        fjs.parentNode.insertBefore(js, fjs)
        console.log('setting fb sdk')
    }(document, 'script', 'facebook-jssdk'))

    window.fbAsyncInit = function onSDKInit() {
        window.FB.init(options)
        window.FB.AppEvents.logPageView()
        Vue.FB = FB
        window.dispatchEvent(new Event('fb-sdk-ready'))
    }
    Vue.FB = undefined
}

Vue.use(vue_fb, {
    appId: '1207720376635833',
    xfbml: true,
    cookie     : true,
    version: 'v13.0'
})

// new Vue({
//     created: function(){
//         window.fbAsyncInit = function() {
//             FB.init({
//             appId      : '1207720376635833',
//             cookie     : true,
//             xfbml      : true,
//             version    : '13.0'
//             });
            
//             FB.AppEvents.logPageView();   
            
//             FB.getLoginStatus(function(response) {
//                 this.statusChangeCallback(response);
//             });
//         }

//         (function(d, s, id){
//         var js, fjs = d.getElementsByTagName(s)[0];
//         if (d.getElementById(id)) {return;}
//         js = d.createElement(s); js.id = id;
//         js.src = "https://connect.facebook.net/en_US/sdk.js";
//         fjs.parentNode.insertBefore(js, fjs);
//         }(document, 'script', 'facebook-jssdk'));
//     }
// });

export default {
    name: 'Login',
    data(){
        return{

        }
    },
    components:{
    },
    methods:{
        async snsLogin(select){
            if(select == 'facebook'){
                // user.snsLogin("1207720376635833");
                window.location.href="https://www.facebook.com/v13.0/dialog/oauth?" + "client_id=" + "1207720376635833" + "&redirect_uri=" + "http://localhost:8080/api/users/test" + "&state=" + "{st:123aa123, ds:123456789}";
            }
            else if(select == 'instagram'){

            }
        },
        async statusChangeCallback(res){
            console.log(res);
        }
    },
    computed:{

    },
}
</script>

<style>
.button {
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button1 {background-color: #4CAF50;} /* Green */
.button2 {background-color: #008CBA;} /* Blue */
</style>