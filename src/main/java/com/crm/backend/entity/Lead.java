package com.crm.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "lead")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(name = "tipo_documento", nullable = false, length = 20)
    private String tipoDocumento;

    @Column(name = "numero_documento", nullable = false, length = 30)
    private String numeroDocumento;

    @Column(nullable = false, length = 20)
    private String telefono;

    @Column(nullable = false, length = 120)
    private String email;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal presupuesto;

    @Column(name = "medio_contacto_preferido", nullable = false, length = 30)
    private String medioContactoPreferido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proyecto_id", nullable = false)
    private Proyecto proyecto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "canal_origen_id", nullable = false)
    private CanalOrigen canalOrigen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario asesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etapa_embudo_id", nullable = false)
    private EtapaEmbudo etapaEmbudo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "motivo_perdida_id")
    private MotivoPerdida motivoPerdida;

    @Column(columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "fecha_primer_contacto")
    private OffsetDateTime fechaPrimerContacto;

    @Column(name = "fecha_ultimo_seguimiento")
    private OffsetDateTime fechaUltimoSeguimiento;

    @Column(nullable = false)
    private Boolean activo;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

}