import _axios from "./default"


export default {
    // user
    snsLogin(userData) {
        console.log("snsLogin!");
      return _axios({
        url: 'https://www.facebook.com/v13.0/dialog/oauth',
        method: 'get',
        params:{
            client_id: userData,
            redirect_uri: 'http://localhost:8080/api/users/test',           // https://53.79.220.127/api/users/test  // http://localhost:8080/api/users/test
            state: {st:'state123abc',ds:'123456789'},
        }
      })
    },
}