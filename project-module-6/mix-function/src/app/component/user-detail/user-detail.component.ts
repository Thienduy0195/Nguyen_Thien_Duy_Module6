import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {UserService} from "../../service/user.service";

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css']
})
export class UserDetailComponent implements OnInit {


  idHide: string = 'none';
  idName: string = 'block';

  active: boolean = false;

  constructor(private activatedRoute: ActivatedRoute,
              private route: Router,
              private userService: UserService) {
  }

  userForm: FormGroup = new FormGroup({
    id: new FormControl(0),
    userName: new FormControl('thienduy0195'),
    fullName : new FormControl('Nguyen Thien Duy', [Validators.required, Validators.pattern('^[AZaz ]+$')]),
    dateOfBirth : new FormControl('1995-01-01', [Validators.required, Validators.pattern('^\\d{4}-\\d{2}-\\d{2}$')]),
    email: new FormControl('thienduy0195@gmail.com', [Validators.required, Validators.email]),
    address: new FormControl('Nui Thanh - Quang Nam', [Validators.required]),
    phoneNumber: new FormControl('0917579123', [Validators.required, Validators.pattern('^(091|090|\\(\\+84\\)90|\\(\\+84\\)91)\\d{7}$')]),
    password: new FormControl('thienduy0195', [Validators.required]),
    status: new FormControl(1)
  });


  ngOnInit(): void {
    // const idFromRoute = Number(this.activatedRoute.snapshot.params.id);
    // this.userService.findById(idFromRoute).subscribe(result => {
    //   console.log(result)
    //   if (result === undefined) {
    //     this.route.navigate(['/error']);
    //   }
    //   this.userForm.patchValue(result);
    // });
  }

  saveUser() {
    const user = this.userForm.value;
    this.userService.saveUser(user).subscribe(value => {
      this.route.navigate(['/users/list']);
    })
  }


  show() {
    console.log(this.idName)
  }
}
