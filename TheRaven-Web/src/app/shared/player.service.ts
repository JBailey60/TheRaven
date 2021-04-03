import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Player } from '../data/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  headers: any;
  currentPlayer!: Player;

  constructor(private http: HttpClient) { 

  }

  getAll(): Observable<any> {
    return this.http.get('')
  }

  async getPlayerFromDb(playerName: string): Promise<Player> {
    const response: Player = await this.http.get<Player>('').toPromise();
    this.currentPlayer = response;
    return response;
  }
}
