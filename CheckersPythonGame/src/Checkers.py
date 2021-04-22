import pygame, sys
from pygame.locals import *

pygame.font.init()

##COLORS##
#             R    G    B 
WHITE    = (255, 255, 255)
BLUE     = (  0,   0, 255)
RED      = (255,   0,   0)
BLACK    = (  0,   0,   0)
GOLD     = (255, 215,   0)
HIGH     = (160, 190, 255)

##DIRECTIONS##
NORTHWEST = "northwest"
NORTHEAST = "northeast"
SOUTHWEST = "southwest"
SOUTHEAST = "southeast"

class Piece:
	def __init__(self, color, king = False):
		self.color = color
		self.king = king

class Square:
	def __init__(self, color, occupant = None):
		self.color = color 
		self.occupant = occupant

def main():
	game = Game()
	game.main()

if __name__ == "__main__":
	main()

class Game:

	def __init__(self):
		self.graphics = Graphics()
		self.board = Board()
		
		self.turn = BLUE
		self.selected_piece = None
		self.hop = False
		self.selected_legal_moves = []

	def setup(self):
		self.graphics.setup_window()

    def update(self):
		self.graphics.update_display(self.board, self.selected_legal_moves, self.selected_piece)

	def terminate_game(self):
		pygame.quit()
		sys.exit

	def main(self):
		self.setup()

		while True: # main game loop
			self.event_loop()
			self.update()
