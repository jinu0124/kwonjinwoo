<template>
  <div id="app">
    <nav>
    </nav>
    <router-view />
  </div>
</template>

<script>
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '1207720376635833',
      cookie     : true,
      xfbml      : true,
      version    : '13.0'
    });
      
    FB.AppEvents.logPageView();   
      
  };

  (function(d, s, id){
      var js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id)) {return;}
      js = d.createElement(s); js.id = id;
      js.src = "https://connect.facebook.net/en_US/sdk.js";
      fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
