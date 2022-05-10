import { Component, OnInit } from '@angular/core';
import { Note } from 'src/app/models/Note';
@Component({
  selector: 'app-notes',
  templateUrl: './notes.component.html',
  styleUrls: ['./notes.component.css']
})
export class NotesComponent implements OnInit {
  notes=[];
  inputnote:string ="";

  constructor() { }

  ngOnInit(): void {
    this.notes=[
      {
        content :'First Note',
        completed:false
      },
      {
        content :'Second Note',
        completed:false
      }
    ]
  }


  toggleDone(id:number){
    this.notes.map((v,i)=>{
      if(i==id) v.completed =!v.completed;

      return v;
    })
  }

  toDelete(id:number){
    this.notes=this.notes.filter((v,i)=>i !==id);
  }
  addnote(){
    this.notes.push({
      content:this.inputnote,
      completed:false
    })
    this.inputnote=""
  }
}