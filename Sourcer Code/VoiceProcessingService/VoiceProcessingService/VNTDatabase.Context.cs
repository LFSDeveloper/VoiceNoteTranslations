﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace VoiceProcessingService
{
    using System;
    using System.Data.Entity;
    using System.Data.Entity.Infrastructure;
    
    public partial class voiceNoteTranslationEntities8 : DbContext
    {
        public voiceNoteTranslationEntities8()
            : base("name=voiceNoteTranslationEntities8")
        {
        }
    
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            throw new UnintentionalCodeFirstException();
        }
    
        public virtual DbSet<audioNote> audioNotes { get; set; }
        public virtual DbSet<audioTranslation> audioTranslations { get; set; }
        public virtual DbSet<language> languages { get; set; }
    }
}
