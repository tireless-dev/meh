package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PartitionRepartition: ImageVector
    get() {
        val current = _partitionRepartition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PartitionRepartition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 6 a4 4 0 0 0 -3.86 3 h-2.73 A2 2 0 0 0 18 9.59 l-3.59 3.58 1.42 1.42 L19.4 11 h2.73 A4 4 0 1 0 26 6 m0 6 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 m-15.83 5.41 L6.6 21 H2 v2 h4.59 c.53 0 1.03 -.2 1.41 -.59 l3.59 -3.58z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 6
                moveTo(x = 26.0f, y = 6.0f)
                // a 4 4 0 0 0 -3.86 3
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.86f,
                    dy1 = 3.0f,
                )
                // h -2.73
                horizontalLineToRelative(dx = -2.73f)
                // A 2 2 0 0 0 18 9.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 9.59f,
                )
                // l -3.59 3.58
                lineToRelative(dx = -3.59f, dy = 3.58f)
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // L 19.4 11
                lineTo(x = 19.4f, y = 11.0f)
                // h 2.73
                horizontalLineToRelative(dx = 2.73f)
                // A 4 4 0 1 0 26 6
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 6.0f,
                )
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // a 2 2 0 1 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // m -15.83 5.41
                moveToRelative(dx = -15.83f, dy = 5.41f)
                // L 6.6 21
                lineTo(x = 6.6f, y = 21.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4.59
                horizontalLineToRelative(dx = 4.59f)
                // c 0.53 0 1.03 -0.2 1.41 -0.59
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = 0.0f,
                    dx2 = 1.03f,
                    dy2 = -0.2f,
                    dx3 = 1.41f,
                    dy3 = -0.59f,
                )
                // l 3.59 -3.58z
                lineToRelative(dx = 3.59f, dy = -3.58f)
                close()
            }
            // M26 18 a4 4 0 0 0 -3.86 3 h-2.73 L8 9.59 A2 2 0 0 0 6.59 9 H2 v2 h4.59 L18 22.41 A2 2 0 0 0 19.41 23 h2.73 A4 4 0 1 0 26 18 m0 6 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // a 4 4 0 0 0 -3.86 3
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.86f,
                    dy1 = 3.0f,
                )
                // h -2.73
                horizontalLineToRelative(dx = -2.73f)
                // L 8 9.59
                lineTo(x = 8.0f, y = 9.59f)
                // A 2 2 0 0 0 6.59 9
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.59f,
                    y1 = 9.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4.59
                horizontalLineToRelative(dx = 4.59f)
                // L 18 22.41
                lineTo(x = 18.0f, y = 22.41f)
                // A 2 2 0 0 0 19.41 23
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.41f,
                    y1 = 23.0f,
                )
                // h 2.73
                horizontalLineToRelative(dx = 2.73f)
                // A 4 4 0 1 0 26 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 18.0f,
                )
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // a 2 2 0 1 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
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
        }.build().also { _partitionRepartition = it }
    }

@Suppress("ObjectPropertyName")
private var _partitionRepartition: ImageVector? = null
