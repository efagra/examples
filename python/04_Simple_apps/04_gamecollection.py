#!/usr/bin/env python2

# Mega Microgames Collection

from Tkinter import *

import rps
import hm
import pd

root = Tk()
root.title ("Mega Microgames Collection")

mainframe = Frame(root, height = 200, width = 500)
mainframe.pack_propagate(0)
mainframe.pack(padx = 5, pady = 5)

intro = Label(mainframe, text = """Welcome to Mega Microgames Collection.
Please select one of the following games to play:
""")
intro.pack(side = TOP)

rps_button = Button(mainframe, text = "Rock, Paper, Scissors", command = rps.gui)
rps_button.pack()

hm_button = Button(mainframe, text = "Hangman", command = hm.gui)
hm_button.pack()

pd_button = Button(mainframe, text = "Poker Dice", command = pd.gui)
pd_button.pack()

exit_button = Button(mainframe, text = "Quit", command = root.destroy)
exit_button.pack(side = BOTTOM)

root.mainloop()
