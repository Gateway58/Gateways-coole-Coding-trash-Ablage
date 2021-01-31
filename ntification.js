let showNotification = () => {
    const notification = new Notification("This is a title", {
        body: " This is the body", 
    });
    notification.onclick = (e) => {
        window.location.href = "https://github.com/Gateway58"; 
    }
}
if(Notification.permission == "granted"){
    showNotification();
}
if(Notification.permission == "default"){
    Notification.requestPermission();
}
if(Notification.permission == "denied"){
    alert('You just denied and DELETED the Notification :-(');
}
