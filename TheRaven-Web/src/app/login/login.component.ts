import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router }  from '@angular/router';

import { Player } from '../data/player';
import {PlayerService} from '../shared/player.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  unvalidatedPlayer: Player;
  returnedPlayer: Player;
  isErrorMessageDisplayed: boolean = false;
  isPasswordValid: boolean = false;

  constructor(private playerService: PlayerService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
  }

  async onSubmit(){
    await this.validateUser();
  }

  async validateUser() {
    this.returnedPlayer = await this.playerService.getPlayerFromDb(this.unvalidatedPlayer.playerName);
    if(this.returnedPlayer != null) {
      this.checkPasswordsAreValid();
      if(this.isPasswordValid) {
        this.router.navigate(["/"])
      }
    }
    this.isErrorMessageDisplayed = true;
  }

  checkPasswordsAreValid() {
    if (this.unvalidatedPlayer.password == this.returnedPlayer.password) {
      this.isPasswordValid = true;
    } else {
      this.isPasswordValid = false;
    }
  }

  clearLogin() {
    this.unvalidatedPlayer = {
      id: null,
      playerName: null,
      password: null
    }

    this.returnedPlayer = null;
    this.isErrorMessageDisplayed = false;
    this.isPasswordValid = false;
  }

}
