using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(_540Assign1.Startup))]
namespace _540Assign1
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
