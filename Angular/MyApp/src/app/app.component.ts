import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title = 'MyApp';
  tabs = [
    {Name :"Home",url:'/hospital',active:true},
    {Name :"Service",url:'/hospital',active:true},
    {Name :"Doctors",url:'/hospital',active:true},
    {Name :"Contact us",url:'#',active:true},
    {Name :"About Us",url:'#',active:true},
    
]
updateTab(tab: any){
  console.log('current tab is',tab)
  this.tabs.forEach(ele =>{
    ele.active=false
  })
  tab.active= true
}
}

