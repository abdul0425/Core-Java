class Phone
{
	int length;
	int width;
	int height;

	Phone(int l, int w, int h)
	{
		length=l;
		width=w;
		height=h;
	}
}
class CameraPhone extends Phone
{
	int pixel;
	CameraPhone(int l, int w, int h, int p)
	{
		super(l,w,h);
		pixel=p;
	}
	void display()
	{
		System.out.println("Length :"+super.length);
		System.out.println("Width :"+super.width);
		System.out.println("Height :"+super.height);
		System.out.println("Pixel :"+this.pixel);
	}
	public static void main(String[] args)
	{
		CameraPhone cp =new CameraPhone(10,5,10,20);
		cp.display();
	}
}