import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {UserService} from "../../service/user.service";
import {User} from "../../model/user";
import {CustomValidators} from "./custom-validators";

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css']
})
export class UserDetailComponent implements OnInit {

  user: User;
  content: string = '';
  inputType: string;
  confirmInputType: string;
  typePassword: boolean = false;
  typeConfirmPassword: boolean = false;
  background = '/assets/img/abc.jpg';

  constructor(private activatedRoute: ActivatedRoute,
              private route: Router,
              private userService: UserService) {
  }

  userForm: FormGroup = new FormGroup({
    id: new FormControl(0),
    userName: new FormControl('thienduy0195'),
    fullName: new FormControl('Nguyen Thien Duy', [Validators.required, Validators.pattern('^[a-zA-Z]+(([\',. -][a-zA-Z ])?[a-zA-Z]*)*$')]),
    // fullName: new FormControl('Nguyen Thien Duy', [Validators.required]),
    dateOfBirth: new FormControl('1995-01-01', [Validators.required, Validators.pattern('^\\d{4}-\\d{2}-\\d{2}$')]),
    email: new FormControl('thienduy0195@gmail.com', [Validators.required, Validators.email]),
    address: new FormControl('Nui Thanh - Quang Nam', [Validators.required]),
    phoneNumber: new FormControl('0917579123', [Validators.required, Validators.pattern('^(091|090|\\(\\+84\\)90|\\(\\+84\\)91)\\d{7}$')]),
    password: new FormControl('thienduy0195', [Validators.required]),
    confirmPassword: new FormControl('thienduy0195', [Validators.required]),
    status: new FormControl(1)
  }, [CustomValidators.mustMatch('password', 'confirmPassword')]);


  ngOnInit(): void {
    this.user = this.userForm.value;
    console.log(this.user)
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
    console.log(this.userForm.value);
    this.user = this.userForm.value;
    this.content = '';
    // const updateUser = this.userForm.value;
    // this.userService.saveUser(updateUser).subscribe(value => {
    //   this.route.navigate(['/users/list']);
    // })
  }

  activeEdit(item: any) {
    this.typePassword = true;
    this.typeConfirmPassword = true;
    console.log(item)
    this.content = item;
    this.setType();
    this.setConfirmType();
  }

  setType() {
    console.log(this.typePassword);
    this.typePassword = !this.typePassword;
    if (this.typePassword === false) {
      this.inputType = 'password';
    } else {
      this.inputType = 'text';
    }
  }

  setConfirmType() {
    console.log(this.typeConfirmPassword);
    this.typeConfirmPassword = !this.typeConfirmPassword;
    if (this.typeConfirmPassword === false) {
      this.confirmInputType = 'password';
    } else {
      this.confirmInputType = 'text';
    }
  }
}
