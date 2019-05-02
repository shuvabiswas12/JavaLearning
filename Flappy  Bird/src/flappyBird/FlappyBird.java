package flappyBird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird extends JFrame implements ActionListener, MouseListener, KeyListener {
	
	protected static FlappyBird flappyBird;
	private Renderer renderer;
	private Rectangle bird;
	private ArrayList<Rectangle> columns;
	private Random random;
	private int ticks, yMotion, label = 1, score, prevLabel, maxScore;
	private boolean gameOver, started, isEnter, isSpace, isN;
	private ImageIcon icon;
	
	public static final int WIDTH = 1200, HEIGHT = 700;
	
	public FlappyBird() {
		random = new Random();		
		initOperation(); // in this method the JFrame is created ... 
		// and besides this flying ball and pipe are also created ...
	}
	
	public void initOperation() {
		renderer = new Renderer();
		
		Timer timer = new Timer(20, this);
		
		icon = new ImageIcon(getClass().getResource("flappy-bird.jpg"));
		this.setIconImage(icon.getImage());
		this.add(renderer);
		this.setVisible(true);
		this.setTitle("Flappy Bird");
		this.setSize(WIDTH, HEIGHT);
		this.addMouseListener(this);
		this.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);		

		bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
	
		columns = new ArrayList<>();
		
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
				
		timer.start(); // if this timer has stopped then the column or pipe will not be displayed 
		
	}
	
	
	// this method can do all the work of painting of column, background and ball also ...
	public void repaint(Graphics g) {
		
		g.setColor(new Color(52, 81, 94));    // for background
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(new Color(66, 142, 146));  // for bottom large bar
		g.fillRect(0, HEIGHT - 120, WIDTH, 150);
		
		g.setColor(new Color(0,  96,  100));  // for rectangle
		g.fillRect(0, HEIGHT - 120, WIDTH, 20);
		
		g.setColor(new Color(255, 234, 0));   // for flying ball
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
		System.out.println("Started");
		System.out.println(bird.x +"\n"+ bird.y +"\n"+ bird.width +"\n"+ bird.height);
		System.out.println("Ended");
		
		for (Rectangle column: columns) {
			paintColumn(g, column);
		}
		
		if (label == 1) {
			//System.out.println("1 Label  = "+label);
			startLabel(g, "Label 1");
		} else if (label == 2) {
			//System.out.println("2 Label  = "+label);
			startLabel(g, "Label 2");
		} else if (label == 3){
			//System.out.println("3 Label  = "+label);
			startLabel(g, "Label 3");
		}
	}
	
	// this method will be call during the starting the label. For example - label-1, label-2 etc ...
	private void startLabel(Graphics g, String labelName) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 100));
		
		if (label == 1) {
			maxScore = 20;
		} else if (label == 2) {
			maxScore = 35;
		} else if (label == 3) {
			maxScore = 50;
		}
		
		if (!started) {
			g.setFont(new Font("Arial", Font.BOLD, 60));
			g.drawString("Click or Press 'Space' To Start!", 75, HEIGHT / 2 - 50);
			g.drawString(labelName, 75,  100);
		}
		
		if (!started && isSpace) {
			jump();
			isSpace = false;
		}
		
		if (!gameOver && isSpace) {
			jump();
			isSpace = false;
		}
		
		if (gameOver && score < maxScore) {
			g.drawString("Game Over!", 100, HEIGHT / 2 - 50);
			g.drawString("Score: "+score, 100,  120);
			System.out.println("Score = "+score);
			if (label == 3 && score == maxScore ) {
				g.setFont(new Font("Arial", Font.PLAIN, 50));
				g.drawString("Congratulation !!", 100, HEIGHT / 2 + 10);
				g.drawString("You have Successfully Finished the game", 100, HEIGHT / 2 + 65);
				
			} else {
				g.setFont(new Font("Arial", Font.PLAIN, 50));
				g.drawString("Press 'Enter' to restart the game!", 100, HEIGHT / 2 + 10);	
			}
			
		}
		
		if (!gameOver && started) {
			g.setFont(new Font("Arial", Font.ITALIC, 50));
			g.drawString(String.valueOf(score), WIDTH / 2 - 25, 100);
			g.drawString("Max Score: "+maxScore, 30,  80);
			g.drawString("Label "+label, 30,  140);
		}
		
		if (started && score == maxScore) {
			
			if (label == 3) {
				g.drawString("Label "+label+" Complete!", 100, HEIGHT / 2 - 50);
				g.drawString("Score: "+score, 100,  100);
				gameOver = true;
				
				g.setFont(new Font("Arial", Font.PLAIN, 50));
				g.drawString("Congratulation !!", 100, HEIGHT / 2 + 10);
				g.drawString("You have Successfully Finished the game", 100, HEIGHT / 2 + 65);
				
			} else {
				g.drawString("Label "+label+" Complete!", 100, HEIGHT / 2 - 50);
				g.drawString("Score: "+score, 100,  100);
				gameOver = true;
				
				g.setFont(new Font("Arial", Font.PLAIN, 50));
				g.drawString("Press 'Enter' to restart the game!", 100, HEIGHT / 2 + 10);
				g.setFont(new Font("Arial", Font.ITALIC, 30));
				g.drawString("Press 'N' for jump to next label!", 100, HEIGHT / 2 + 65);
			}
			
		}
		
		if (isEnter && gameOver) {
			
			if (label == 3) {
				if (score == maxScore) {
					isEnter = false;
					System.out.println("false");
				} else {
					System.out.println("true");
					jump();
					isEnter = false;
				}
			} else {
				jump();
				isEnter = false;
			}
			
			
		} else if (isN && gameOver && label > prevLabel) {
			jump();
			isN = false;
		}
			
	}
	
	// this jump() method created for jumping the ball up and down ...
	private void jump() {
		
		if (gameOver) {
			bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			columns.clear();
			yMotion = 0;
			score = 0;
			
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);
			gameOver = false;
		}		
		
		if (!started) {
			started = true;
		}
		else if (!gameOver) {
			if (yMotion > 0) {
				yMotion = 0;
			}
			yMotion -= 10;
		}		
	}

	// addcColumn() method will be called during the creation of JFrame for creating column or pipes ...
	public void addColumn(boolean start) {
		int space = 300;
		int width = 100;
		int height = 50 + random.nextInt(300);
		
		if (start) {
			
			// 1st 4 columns located at bottom
			columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
			
			// 1st 4 columns located at top
			columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
			
		} else {
			
			columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height - 120, width, height));			
			columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
		
		}
	}
	
	public void paintColumn(Graphics g, Rectangle column) {
		g.setColor(new Color(142, 172, 187));
		g.fillRect(column.x, column.y, column.width, column.height);
	}
	
	// action listener in here ... 
	// when i clicked on window that what happened that's are include in here ... 
	@Override
	public void actionPerformed(ActionEvent e) {
		//int speed = 10;
		ticks++;
		
		if (label == 1) {
			//System.out.println("label = "+label);
			birdProgress(10);
		}
		if (label == 2) {
			//System.out.println("label = "+label);
			birdProgress(15);
		}
		if (label == 3) {
			//System.out.println("label = "+label);
			birdProgress(19);
		}
		
		renderer.repaint();
	}
	
	// the situation of bird or ball which is created by rectangle ...
	// that means how the ball or bird be work ... for example - how to jump to up or down ...   
	private void birdProgress(int speed) {
		
		if (started) {
			
			for (int i = 0; i<columns.size(); i++) {
				Rectangle column = columns.get(i);
				column.x -= speed;
			}
			
			if (ticks % 2 == 0 && yMotion < 15) {
				yMotion += 2;
			}
			
			for (int i=0; i<columns.size(); i++) {
				Rectangle column = columns.get(i);
				
				if (column.x + column.width <0) {
					columns.remove(column);
					
					if (column.y == 0) {
						addColumn(false);
						
					}
				}
			}
			
			bird.y += yMotion;
			
			for (Rectangle column : columns) {
				
				if(column.y==0 && bird.x + bird.width/2> column.x+ column.width/2-10 && bird.x+ bird.width/2<column.x+column.width/2+5)
				{
					score++;
				}
				
				if (column .intersects(bird)) {
					gameOver = true;
					//bird.x = column.x - bird.width; // the bird is stay before upon a rectangle in here
					
					if (column.intersects(bird)) {
						gameOver = true;
						if(bird.x <= column.x)
						{
							bird.x = column.x - bird.width;
						}
						else
						{
							if(column.y !=0)
							{
								bird.y = column.y - bird.height;
							}
							else if(bird.y<column.height)
							{
								bird.y = column.height;
							}
						}			
						
					}
				}
			}
			
			/** gameOver will true here */
			if (bird.y > HEIGHT - 120 || bird.y < 0) {
				gameOver = true;
			}
			
			/** This is work when bird is fall down, after that by this code that bird will stay on bar */
			if (bird.y + yMotion >= HEIGHT - 120) {
				bird.y = HEIGHT - 120 - bird.height;
			}
			
		}
	}

	
	public static void main(String[] args) {
		flappyBird = new FlappyBird();
	}

	
	// here are some of the overwritten method of mouseListener and keyListener ...  
	@Override
	public void mouseClicked(MouseEvent e) {
		//jump();
		isSpace = true;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//jump();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			isEnter = true;
		} else if (e.getKeyCode() == KeyEvent.VK_N && label != 3) {
			prevLabel = label;
			label++;
			isN = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			isSpace = true;
		}
		
	}

	
	/**
	 * 
	 *  Thank You :-)
	 *  16/05/2018
	 *  
	 *  << -----------------Happy Coding----------------- >>
	 *  
	 *  */
	
	
}
