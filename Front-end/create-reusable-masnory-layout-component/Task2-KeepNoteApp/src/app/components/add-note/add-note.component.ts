import { Component, OnInit, Output, EventEmitter } from '@angular/core'
import { Note } from 'src/app/models/note'
import { formatDate } from '@angular/common'

@Component({
  selector: 'app-add-note',
  templateUrl: './add-note.component.html',
  styleUrls: ['./add-note.component.css'],
})
export class AddNoteComponent implements OnInit {
  format = 'dd-MMM-yyyy'
  myDate = new Date()
  locale = 'en-US'
  formattedDate = formatDate(this.myDate, this.format, this.locale)

  model: Note = new Note(this.formattedDate.toString(), '')
  @Output() noteAdded: EventEmitter<Note> = new EventEmitter()
  constructor() {}

  ngOnInit(): void {}

  onSubmit() {
    this.noteAdded.emit(
      new Note(this.formattedDate.toString(), this.model.content),
    )
  }
}
