package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataDefinition: ImageVector
    get() {
        val current = _dataDefinition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataDefinition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="14.0" cy="14.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20 30 a1 1 0 0 1 -.7 -.3 L8.58 19 A2 2 0 0 1 8 17.59 V10 a2 2 0 0 1 2 -2 h7.59 A2 2 0 0 1 19 8.59 l10.7 10.7 a1 1 0 0 1 0 1.42 l-9 9 A1 1 0 0 1 20 30 M10 10 v7.59 l10 10 L27.59 20 l-10 -10Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 30
                moveTo(x = 20.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.7 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -0.3f,
                )
                // L 8.58 19
                lineTo(x = 8.58f, y = 19.0f)
                // A 2 2 0 0 1 8 17.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 17.59f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 7.59
                horizontalLineToRelative(dx = 7.59f)
                // A 2 2 0 0 1 19 8.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 8.59f,
                )
                // l 10.7 10.7
                lineToRelative(dx = 10.7f, dy = 10.7f)
                // a 1 1 0 0 1 0 1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                // l -9 9
                lineToRelative(dx = -9.0f, dy = 9.0f)
                // A 1 1 0 0 1 20 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 30.0f,
                )
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // v 7.59
                verticalLineToRelative(dy = 7.59f)
                // l 10 10
                lineToRelative(dx = 10.0f, dy = 10.0f)
                // L 27.59 20
                lineTo(x = 27.59f, y = 20.0f)
                // l -10 -10z
                lineToRelative(dx = -10.0f, dy = -10.0f)
                close()
            }
            // M12 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v8 h-2 V4 H4 v24 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 30
                moveTo(x = 12.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _dataDefinition = it }
    }

@Suppress("ObjectPropertyName")
private var _dataDefinition: ImageVector? = null
