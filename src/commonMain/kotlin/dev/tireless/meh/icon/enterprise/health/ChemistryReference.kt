package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChemistryReference: ImageVector
    get() {
        val current = _chemistryReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChemistryReference",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // L 8.586 22
                lineTo(x = 8.586f, y = 22.0f)
                // L 2 28.586
                lineTo(x = 2.0f, y = 28.586f)
                // L 3.414 30
                lineTo(x = 3.414f, y = 30.0f)
                // L 10 23.414
                lineTo(x = 10.0f, y = 23.414f)
                // L 10 28
                lineTo(x = 10.0f, y = 28.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 4 20z
                lineTo(x = 4.0f, y = 20.0f)
                close()
            }
            // M20 13.67 V4 h2 V2 H10 v2 h2 v9.67 L9.58 17 h2.48 L14 14.33 V4 h4 v10.33 l7.61 10.46 a2 2 0 0 1 -.44 2.82 A2 2 0 0 1 23.98 28 H15 v2 h8.98 a4.02 4.02 0 0 0 3.25 -6.38Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 13.67
                moveTo(x = 20.0f, y = 13.67f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 9.67
                verticalLineToRelative(dy = 9.67f)
                // L 9.58 17
                lineTo(x = 9.58f, y = 17.0f)
                // h 2.48
                horizontalLineToRelative(dx = 2.48f)
                // L 14 14.33
                lineTo(x = 14.0f, y = 14.33f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 10.33
                verticalLineToRelative(dy = 10.33f)
                // l 7.61 10.46
                lineToRelative(dx = 7.61f, dy = 10.46f)
                // a 2 2 0 0 1 -0.44 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.44f,
                    dy1 = 2.82f,
                )
                // A 2 2 0 0 1 23.98 28
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.98f,
                    y1 = 28.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8.98
                horizontalLineToRelative(dx = 8.98f)
                // a 4.02 4.02 0 0 0 3.25 -6.38z
                arcToRelative(
                    a = 4.02f,
                    b = 4.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.25f,
                    dy1 = -6.38f,
                )
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _chemistryReference = it }
    }

@Suppress("ObjectPropertyName")
private var _chemistryReference: ImageVector? = null
