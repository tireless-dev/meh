package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InformationFilled: ImageVector
    get() {
        val current = _informationFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.InformationFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 8 a1.5 1.5 0 1 1 -1.5 1.5 A1.5 1.5 0 0 1 16 8 m4 13.88 h-2.87 v-8 H13 v2.24 h1.88 v5.75 H12 v2.25 h8Z
            path {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // a 1.5 1.5 0 1 1 -1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 1.5f,
                )
                // A 1.5 1.5 0 0 1 16 8
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 8.0f,
                )
                // m 4 13.88
                moveToRelative(dx = 4.0f, dy = 13.88f)
                // h -2.87
                horizontalLineToRelative(dx = -2.87f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // v 2.24
                verticalLineToRelative(dy = 2.24f)
                // h 1.88
                horizontalLineToRelative(dx = 1.88f)
                // v 5.75
                verticalLineToRelative(dy = 5.75f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 2.25
                verticalLineToRelative(dy = 2.25f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
            }
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m0 6 a1.5 1.5 0 1 1 -1.5 1.5 A1.5 1.5 0 0 1 16 8 m4 16.13 h-8 v-2.25 h2.88 v-5.75 H13 v-2.25 h4.13 v8 H20Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // a 1.5 1.5 0 1 1 -1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 1.5f,
                )
                // A 1.5 1.5 0 0 1 16 8
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 8.0f,
                )
                // m 4 16.13
                moveToRelative(dx = 4.0f, dy = 16.13f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -2.25
                verticalLineToRelative(dy = -2.25f)
                // h 2.88
                horizontalLineToRelative(dx = 2.88f)
                // v -5.75
                verticalLineToRelative(dy = -5.75f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // v -2.25
                verticalLineToRelative(dy = -2.25f)
                // h 4.13
                horizontalLineToRelative(dx = 4.13f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 20z
                horizontalLineTo(x = 20.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _informationFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _informationFilled: ImageVector? = null
